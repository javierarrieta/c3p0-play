val projectName = "c3p0-play"

version := "0.1.3"

organization := "com.mchange"

name := projectName

sbtVersion in Global := "0.13.0"

scalaVersion in Global := "2.11.5"

scalacOptions := Seq("-feature", "-deprecation")

libraryDependencies ++= Seq(
  "com.mchange" % "c3p0" % "0.9.5-pre10", 
  "com.mchange" %% "mlog-scala" % "0.3.4", 
  "com.typesafe.play" %% "play-jdbc" % "2.3.8",
  "org.scalaz.stream" %% "scalaz-stream" % "0.6a",
  "org.specs2" %% "specs2" % "2.4.14"
)

resolvers ++= Seq(
  "bintray" at "http://dl.bintray.com/scalaz/releases",
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

pomExtra := (
      <url>https://github.com/swaldman/{projectName}</url>
      <licenses>
        <license>
          <name>GNU Lesser General Public License, Version 2.1</name>
          <url>http://www.gnu.org/licenses/lgpl-2.1.html</url> 
          <distribution>repo</distribution>
        </license>
        <license>
          <name>Eclipse Public License, Version 1.0</name>
          <url>http://www.eclipse.org/org/documents/epl-v10.html</url> 
          <distribution>repo</distribution>
        </license>
     </licenses>
     <scm>
       <url>git@github.com:swaldman/{projectName}.git</url>
       <connection>scm:git:git@github.com:swaldman/{projectName}.git</connection>
     </scm>
     <developers>
       <developer>
         <id>swaldman</id>
         <name>Steve Waldman</name>
         <email>swaldman@mchange.com</email>
       </developer>
     </developers>
  )







