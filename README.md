## Program structure

The program is made of these classes:

- [`AstPrinter`](src/main/java/dev/randomcode/calculator/AstPrinter.java): This class implements a visitor for expressions that prints them out
- [`Calculator`](src/main/java/dev/randomcode/calculator/Calculator.java): This is the driver and main class of the program, it handles the menu loop
- [`DegreesMode`](src/main/java/dev/randomcode/calculator/DegreesMode.java): This is an enum for whether the calculator uses degrees or radians
- [`Evaluator`](src/main/java/dev/randomcode/calculator/Evaluator.java): This is class implements a visitor which evaluates expressions
- [`MainMenuOptions`](src/main/java/dev/randomcode/calculator/MainMenuOptions.java): This enum has the options for the main menu of the calculator
- [`MathFunction`](src/main/java/dev/randomcode/calculator/MathFunction.java): This enum contains mathematical functions, such as trigonometry and square roots
- [`Operator`](src/main/java/dev/randomcode/calculator/Operator.java): This enum contains arithmetic and other operators
- [`Parser`](src/main/java/dev/randomcode/calculator/Parser.java): This class implements a recursive descent parser that turns expressions into abstract syntax trees,
  which can be evaluated
- [`Token`](src/main/java/dev/randomcode/calculator/Token.java): This class represents a token such as a number, function, operator, or parenthesis, and stores the
  type as well as data for it (if any is needed)
- [`TokenScanner`](src/main/java/dev/randomcode/calculator/TokenScanner.java): This class implements a parser which converts a string into
  tokens which can be turned into an abstract syntax tree
- [`TokenType`](src/main/java/dev/randomcode/calculator/TokenType.java): This enum has the types a token can be
- [`Util`](src/main/java/dev/randomcode/calculator/Util.java): This implements the `displayMenu` function, which makes a menu for the user from an enum
  and functions for reading numbers from standard input

`Parser`, `TokenScanner`, and `AstGenerator` are based on a [tutorial I found](https://craftinginterpreters.com/contents.html).
I tried to implement similar functionality myself using a very bad tokenizer and the shunting yard algorithm,
but I was only partially successful. I wanted my calculator to not be fragile, and the code I wrote just wasn't
working on some expressions. I do mostly understand the code from the tutorial, and I didn't directly copy and paste
from it (although some functions I typed out unchanged).

The `MathFunction` and `Operator` classes each take two lambda functions in their constructors, one
to read their inputs from standard input, and one to perform their calculation. These are accessible
through the `getInputs` and `execute` functions.

Additionally, the
[`AstGenerator`](src/main/java/dev/randomcode/calculatortool/AstGenerator.java)
class implements a separate program for generating the classes used in the
abstract syntax tree. The AST uses the visitor pattern, where you have an
interface that has a visit method for each type, and an accept method that calls
the right one for an object. New operations are defined by making a class that
implements the interface. This makes it more convenient to do operations on
expressions.
