<h1>Task Tracker</h1>

Task tracker is a project used to track and manage your tasks. In this task, you will build a simple command line interface (CLI) to track what you need to do, what you have done, and what you are currently working on. 


<h3>
  Execution command
</h3>

Run the next execution program to start the application.
If you don't have a user and password, the app will generate you a user instantly.

***
  java -jar target/TaskTracker-1.0.jar [user] [password]
***


<h3>
  The list of commands and their usage is given below:
</h3>

# Adding a new task
task-cli add "Buy groceries"
# Output: Task added successfully (ID: 1)

# Updating and deleting tasks
task-cli update 1 "Buy groceries and cook dinner"
task-cli delete 1

# Marking a task as in progress or done
task-cli mark-in-progress 1
task-cli mark-done 1

# Listing all tasks
task-cli list

# Listing tasks by status
task-cli list done
task-cli list todo
task-cli list in-progress
