name := "scalaqlite"

organization := "com.meraki"

version := "0.7-RC1"

scalaVersion := "2.11.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.4" % "test"

scalacOptions in Test ++= Seq("-deprecation")

testOptions in Test += Tests.Argument("-Djava.library.path=target/native")

publishTo := Some(Resolver.file("file",  new File( "releases" )) )
