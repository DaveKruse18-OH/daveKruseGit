For the next step of the interview process, we'd like to have you write a little bit of code. We've tried to keep the problem statement minimal so that it shouldn't take too much time.

If you have any questions please send us an email. If the problem statement doesn't specify something, you can make any decision that you want. Your code *will not* be evaluated on its ability to handle anything that wasn't mentioned in the problem statement. You do not need to persist any data to disk.

Please include a README with your submission describing your approach to solving the problem. Do not include your name or any personally identifiable information in your readme. We anonymize code samples when we review them to reduce the chance for bias in the review process.

We're looking for a solution that is representative of code that you would write on a real project, including tests. You can complete this at your convenience — there isn't a specific deadline for it.

Package your code as a tarball (`tar zcvf your-code.tgz your-code-dir`) or a gitbundle (`GIT_DIR=your-code-dir/.git git bundle create your-code.gitbundle --all`). Send the file to us via the Dropbox link in the email we sent to you about this coding exercise. It should be from Chris Evans or Tim Hill.

## Problem Statement

Let's write some code to track driving history for people.

The code will process an input file. You can either choose to accept the input via stdin (e.g. if you're using Ruby `cat input.txt | ruby yourcode.rb`), or as a file name given on the command line (e.g. `ruby yourcode.rb input.txt`). You can use any programming language that you want. Please choose a language that allows you to best demonstrate your programming ability.

Each line in the input file will start with a command. There are two possible commands.

The first command is Driver, which will register a new Driver in the app. Example:

`Driver Dan`

The second command is Trip, which will record a trip attributed to a driver. The line will be space delimited with the following fields: the command (Trip), driver name, start time, stop time, miles driven. Times will be given in the format of hours:minutes. We'll use a 24-hour clock and will assume that drivers never drive past midnight (the start time will always be before the end time). Example:

`Trip Dan 07:15 07:45 17.3`

Discard any trips that average a speed of less than 5 mph or greater than 100 mph.

Generate a report containing each driver with total miles driven and average speed. Sort the output by most miles driven to least. Round miles and miles per hour to the nearest integer.

Example input:

```
Driver Dan
Driver Lauren
Driver Kumi
Trip Dan 07:15 07:45 17.3
Trip Dan 06:12 06:32 21.8
Trip Lauren 12:01 13:16 42.0
```

Expected output:

```
Lauren: 42 miles @ 34 mph
Dan: 39 miles @ 47 mph
Kumi: 0 miles
```

## Expectations and Evaluation Criteria

As experienced software engineers know, there's a wide variety of solutions to any problem. Interview coding problems can be especially unclear about expectations as the tasks can range from a quick [fizz buzz](http://wiki.c2.com/?FizzBuzzTest) screening problem to fully fledged applications. Although we've given a relatively simple problem to solve, we're looking for you to implement enough code to demonstrate expertise with domain modeling and testing.

We're interested in the thought process behind your choices, so please take some time to capture that in your README. For example, you can represent your data using primitives, structs, or objects. We don't consider any one of those options better than the others. However, we expect you to make an intentional choice, implement it consistently, and communicate why you chose that approach.

In general, we're looking for a little more structure than what the problem actually necessitates. Although we understand the principle of YAGNI and the desire to keep code simple, we didn't want to add so many requirements to this exercise that it'd take a massive amount of time. Don't go overboard with this — we don't want to see a complex overabundance of abstraction. We also don't want to see all of the code in a single function, even though this problem is simple enough to reasonably implement it that way.

We'll be evaluating solutions on:

* object modeling / software design
* testing approach
* use of language idioms relative to expertise with that language
* thought process captured in the README
