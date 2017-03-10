# pattern-play
My play with design patterns to understand their applications.

## Patterns

### Command & Active Object Pattern

The Command pattern is simple, execute a command using fields of the class set in the constructor.
The Active Object pattern is an engine for Command Implementations.

#### Step

Interface with one method, execute.
This is the Command Pattern

#### StepEngine

This is the engine for executing the test steps.
This is the Active Object pattern.

### Singleton Pattern

This pattern ensures there is only one instance of a class in the JVM.
Private constructor, static field and "getInstance" method.

#### Session

Information needs to pass between steps. 
The singleton pattern will ensure that all the steps share the same instance.

*this will make it hard to unit test these classes if I want to mock the session*

### Facade Pattern

Create a new interface to "wrap" an existing API.
This can be to simplify the API, adapt it to your needs, or control functionality.

#### Tool & HttpTool

HttpTool will be a facade on top of apache common components httpclient

### Decorator Pattern

"Decorate" the functionality of an existing implementation.
The decorator impl is an instance of the API and has an instance of the API.
This pattern can allow generic functionality be applied to multiple implementations of an API.
Useful when some new functionality is required in an API in production.


Can also be used like a builder. An interface & a set of subclasses can be composed into one final object.
A property of the final object is spread throughout the subclasses and the decorate pattern allows the jvm to go through the chain and create the 
final property.
 
#### Logger

Logger class decorates each step with logging of useful execution information: started with args and finished in x time.

### Observer Pattern

This pattern allows classes to be notified, and updated when other classes change.

#### StepObserver & StepSubject

The StepSubject adds, removes & notifies observers. The StepObserver is updated by a StepSubject.
In this case the Observer will store KPI information about the step execution.

## Notes & Thoughts

* From my usage of Decorator & Observer they could be used for the same problem.
