# Schema Error

This repo recreates some strange behavior I'm seeing with Prismatic's schema library & AOT compilation. I wrote a `clone-ns` macro so that I could slowly start migrating my clj-only code over to cljx files in a different root without breaking all of my current imports. Each `clj` model calls `clone-ns` on its `cljx` counterpart.

This works great in development mode at the repl, but fails when I try to deploy it into production. This project is a recreation of that issue.

## Usage

I'm seeing this error under AOT compilation. To recreate, run the following command in the project root:

```sh
 lein uberjar && java -jar target/schema-standalone.jar 10
```

The code DOES work if you clean, then run it with `lein run`:

```sh
lein do clean, run 10
```

Note that if you run `lein run 10` directly after the `lein uberjar <etc>` command, the code fails with the same error.
