package com.github.vertical_blank.sqlformatter.scala

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("sql-formatter", JSImport.Namespace)
object Facade extends js.Object {
  def format(obj: js.Any): String = js.native
}

object SqlFormatter {
  def format(sql: String): String = Facade.format(sql)
}