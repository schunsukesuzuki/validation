package jto.validation
package v3.tagless
package jsonast

import jto.validation.jsonast._

class CrossCompile extends v3.tagless.CrossCompile[JValue] {
  val rg = RulesGrammar
  val wg = WritesGrammar
  def upcast = implicitly
}