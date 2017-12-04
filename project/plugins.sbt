addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

libraryDependencies <+= sbtVersion(v => "org.scala-sbt" % "scripted-plugin" % v)

