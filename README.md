Adam's To-do
============

_To my CS professor, Adam Purtee._

A simple to-do list app for the CLI. Nothing complicated, no fuss, no muss.
Simple, reliable, gets the job done. Finally a to-do app you can count on.

What it looks like
------------------

```
$ todo Math homework 10/7                    # Add a to-do
$ todo remind Clinic testing today 11:00     # Add a reminder
$ todo optional Attend Tom's speech today    # Add an optional to-do
$ todo                                       # List all to-do's
$ todo done 2                                # Mark to-do #2 as done
```

Download
--------

Install
-------

How to use it
-------------

### Basic features

Adam's To-do has all the features you would expect in any functional to-do list
app. These are the only things you need to learn to begin using Adam's To-do.
Take a look.

```
$ todo                          # List all to-do's
$ todo list                     # Same as above
$ todo Travel downtown          $ Add a to-do with no deadline
$ todo CS project 3 12/8        # Add a to-do with a deadline
$ todo History homework today   # Add a to-do to be done today (you can also use 'tomorrow')
$ todo done 9                   # Mark to-do #9 as done
$ todo done 1 2 3               # Mark to-do's 1, 2, and 3 as done
$ todo edit 5                   # Edit to-do #5
$ todo delete 7                 # Delete to-do #7
```

That is all you need to know to start using Adam's To-do as a fully functional
to-do app. If you are ready to learn more advanced features, read on.

### Adding and managing to-do lists

Adam's To-do allows you to create many to-do lists. Each to-do list must and can
only have a one-word name. You can name your list anything but "default".

```
$ todo create shopping          # Create a new to-do list
$ todo rename books             # Rename a list
$ todo delete grocery           # Delete a list
$ todo lists                    # List all to-do lists
```

A default to-do list is always available and is used if you do not specify a
different list. To add and manage to-do's on a different list, simply add the
name of the list after the command word 'todo'.

```
# Re-call these basic commands introduced earlier
# They act on the default to-do list

$ todo                          # List all to-do's in the default list
$ todo list                     # Same as above
$ todo Research about cars      # Add a to-do with a deadline in the default list
$ todo done 3                   # Mark to-do #3 in the default list as done
$ todo edit 2                   # Edit to-do #2 in the default list
$ todo delete 1                 # Delete to-do #1 in the default list

# Now just add a custom list's name to use a different list instead

$ todo shopping                 # Same as 'todo list shopping'
$ todo shopping list            # Same as 'todo list shopping'
$ todo shopping Bean bag chair  # Add a to-do to the shopping list
$ todo shopping done 2          # Mark to-do #2 in the shopping list as done
$ todo shopping edit 1          # Edit to-do #1 in the shopping list
```

### Aborting a to-do

```
$ todo delete 3  # Recall from a previous section that you can delete a to-do
$ todo abort 2   # But you can abort it instead
```

The `abort` and `delete` commands seem similar, but the `abort` command counts
the specific to-do as something that should have been completed, while `delete`
simply deletes the specified to-do and nothing more.

This distinction makes a difference in your performance record which is tracked
by Adam's To-do and can be shown by running `todo stats` (see the _Statistics_
section below). For example, if you have 5 tasks on your to-do list, and you do
3 and abort 2, then you have completed 3 out of 5 tasks—a measured productivity
of 60%. If instead of aborting, you delete those 2 tasks, you have completed 3
out of 3 tasks (100% productivity).

### Statistics

Adam's To-do tracks your performance. These commands allow you to see how
productive you are today, on a specific day, in a specific month, and/or a
specific year.

```
$ todo done                     # See what you have done today
$ todo done today               # Same as 'todo done'
$ todo done 12/10               # See what you have done on a specific day
$ todo done 12/10/2019          # ...even if the day is on another year
$ todo stats                    # See your cumulative performance
$ todo stats 2019               # See your performance in a specific year
$ todo stats 8                  # See your performance in a specific month
$ todo stats aug                # Same as above
$ todo stats 8/2019             # See your performance in a specific month in a specific year
$ todo stats aug 2019           # Same as above
```

### Special types of to-do's

Adam's To-do can also be used to set reminders for special events.

```
$ todo remind Tech conference                # Set a reminder for today
$ todo remind Annual feast today             # Same as above
$ todo remind Bruno's livestream tomorrow    # Set a reminder for tomorrow
$ todo remind Amy's birthday 12/12           # Set a reminder for a certain day
$ todo remind Advent of Code 2022 12/1/2022  # Set a reminder for a certain day of a future year
```

You can also create optional to-do's. Optional to-do's do not strike against
your productivity stats if you do not complete them, but if you do, they will
improve your measured productivity.

```
$ todo optional Read about Ancient Rome      # Add an optional task for today
$ todo optional Attend extra lectures today  # Add an optional task with a deadline
```

Once added, reminders and optional to-do's appear on your to-do's list and can
be edited, removed, or marked as done in the same way that is done with normal
to-do's, meaning there is no extra keyword to type.

```
$ todo                          # List all normal to-do's, reminders, and optional to-do's
$ todo done 11                  # Mark optional to-do #11 as done
$ todo edit 7                   # Edit optional to-do #7
$ todo delete 2                 # Delete reminder #1
```

To add reminders and optional to-do's on a different list, insert the name of
the list after the keyword 'remind'/'optional':

```
$ todo remind birthdays Max 5/5
$ todo optional shopping LED lights
```

