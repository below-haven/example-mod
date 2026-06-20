# BH Test Mod

Small Java 25 Fabric Loader mixin mod scaffold.

The Gradle toolchain and compiler release are Java 25. The Mixin config declares
`JAVA_8` compatibility because this loader runtime refuses newer Mixin
compatibility levels during config initialisation, even while running on a Java
25 VM.

## Build

```sh
./gradlew build
```

The local loader only adds a custom game provider, so this project targets official Fabric artifacts from Fabric's Maven.

The mod jar is written to `build/libs/bh-test-mod-1.0.0.jar`.

## String-targeted mixin

`ExampleTargetMixin` uses `@Mixin(targets = "...", remap = false)` so it does not need namespaces or mappings. Replace the placeholder target class and method in:

- `src/main/java/com/bh/testmod/mixin/ExampleTargetMixin.java`

The sample mixin intentionally has no injector method yet. This keeps the
scaffold loadable under the current Spiral Knights runtime, whose Java image
does not expose `java.compiler` and therefore cannot initialise Sponge Mixin's
injector support classes. If you want to use `@Inject`, launch the game JVM with
`--add-modules java.compiler` or use a runtime image that includes that module.
