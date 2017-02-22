# pattern-play
My play with design patterns to understand their applications

## Patterns

### Command & Active Object Pattern

The Command pattern is simple, execute a command using fields of the class set in the constructor.
The Active Object pattern is an engine for Command Implementations.

#### TestStep

Interface with one method, execute.
This is the Command Pattern

#### TestStepEngine

This is the engine for executing the test steps.

#### Session

Information needs to pass between test steps


