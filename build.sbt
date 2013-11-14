version := "0.1.0-SNAPSHOT"

organization := "com.mchange"

name := "c3p0-play"

sbtVersion in Global := "0.13.0"

scalaVersion in Global := "2.10.2"

scalacOptions := Seq("-feature", "-deprecation")

libraryDependencies ++= Seq(
  "com.mchange" % "c3p0" % "0.9.5-pre6-SNAPSHOT" changing(), 
  "com.mchange" % "mchange-commons-java" % "0.2.6.3-SNAPSHOT" changing(), 
  "com.mchange" %% "mlog-scala" % "0.3.0", 
  "com.typesafe.play" %% "play-jdbc" % "2.2.0"
)

resolvers ++= Seq(
  "typesafe" at "http://repo.typesafe.com/typesafe/releases", 
  "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

publishTo <<= version { 
  (v: String) => {
    if (v.trim.endsWith("SNAPSHOT"))
      Some("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots" )
    else
      Some("releases"  at "https://oss.sonatype.org/service/local/staging/deploy/maven2" )
  }
}






