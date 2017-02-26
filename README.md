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
