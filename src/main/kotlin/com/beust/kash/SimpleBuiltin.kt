package com.beust.kash

import com.beust.kash.api.Builtin
import com.beust.kash.api.CommandResult
import com.beust.kash.api.IKashContext

class SimpleBuiltin {
    @Builtin
    fun hello(words: List<String>, context: IKashContext): CommandResult {
        println("Hello " + (if (words.size > 1) words[1] else "stranger"))
        val result = context.lineRunner.runLine("ls", context, true)
        result.display()
        return CommandResult(0)
    }
}
