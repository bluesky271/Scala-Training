object Test extends App {

  for (words <- args) patternMatchInput(words)

  def patternMatchInput(word: String) = {
    word match {
      case "Password" => printResults(true)
      case _ => printResults(false)
    }
  }

  def printResults(arguments: Boolean) = {
    if (arguments) println("You have passed!")
    else println("You failed!")
  }
}