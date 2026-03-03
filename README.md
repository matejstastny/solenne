# Solenne

A [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/libgdx/gdx-liftoff).

This project was generated with a template including simple application launchers and an `ApplicationAdapter` extension
that draws libGDX logo.

## Platforms

- `core`: Main module with the application logic shared by all platforms.
- `lwjgl3`: Primary desktop platform using LWJGL3; was called 'desktop' in older docs.

## Gradle

This project uses [Gradle](https://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `build`: builds sources and archives of every project.
- `cleanEclipse`: removes Eclipse project data.
- `cleanIdea`: removes IntelliJ project data.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `eclipse`: generates Eclipse project data.
- `idea`: generates IntelliJ project data.
- `lwjgl3:jar`: builds application's runnable jar, which can be found at `lwjgl3/build/libs`.
- `lwjgl3:run`: starts the application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should
be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.

[Tutorial](https://libgdx.com/wiki/start/a-simple-game#the-game-life-cycle)

## Distribution

The project uses [Construo](https://github.com/fourlastor-jams/construo) to produce self-contained,
platform-specific executables with a bundled JRE. No Java installation required by end-users.

All distribution artifacts are collected in the `dist/` folder at the repository root.

### Build everything at once

    ./gradlew package

Builds the fat JAR and all four platform bundles, placing everything in `dist/`.

### Individual platform bundles (bundled JRE — no Java required on end-user machine)

| Task | Platform | Output |
|------|----------|--------|
| `lwjgl3:packageLinuxX64` | Linux x86-64 | `.zip` |
| `lwjgl3:packageMacM1` | macOS Apple Silicon (ARM64) | `.zip` containing a `.app` |
| `lwjgl3:packageMacX64` | macOS Intel (x86-64) | `.zip` containing a `.app` |
| `lwjgl3:packageWinX64` | Windows x86-64 | `.zip` |

Example:

    ./gradlew lwjgl3:packageLinuxX64

### Fat JAR (requires Java 21 on end-user machine)

    ./gradlew lwjgl3:distJar

Produces a single runnable JAR in `dist/`. Useful for power users who already have Java installed.

    java -jar dist/<filename>.jar

### Clean distribution output

    ./gradlew lwjgl3:cleanDist
