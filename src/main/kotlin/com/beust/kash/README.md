Example of static extensions to the [Kash shell](https://github.com/cbeust/kash).

To add this extension to Kash:

```
$ ./gradlew assemble
```

Next, edit `~/.kash.json`, point the `classPaths` key to the jar file that was created by the build in `build/libs`, and declare the class that contains your extensions to Kash:

```json
{
    "classPaths": [
        "~/kotlin/kash-example/build/libs/kash-example.jar"
    ],
    "extensions": [
        "com.beust.kash.SimpleBuiltin"
    ]
}
```

This extension contains a built-in called `"hello"` which is now available to Kash:

```
$ kash
kash$ hello
Hello stranger
kash$ hello Cedric
Hello Cedric
```