name := "scalaqlite"

organization := "com.meraki"

version := "0.6-SNAPSHOT"

scalaVersion := "2.10.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.4" % "test"

testOptions in Test += Tests.Argument("-Djava.library.path=target/native")

publishTo := Some(Resolver.file("file",  new File( "releases" )) )
