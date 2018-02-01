object Test extends App {

  var userDataBase = Map[String, User]

  case class User(userName: String, group: String, password: String, userDefined: UserDetails)
  case class UserDetails(firstName: String, lastName: String, age: Int, nationality: String)

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