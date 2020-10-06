# File I/O - Writing

The purpose of this exercise is to provide you with the opportunity to create command line applications that can create and write to files.

## Learning Objectives

After completing this exercise, students will understand:

* How to programmatically create and write to text files.
* How to read, interpret, and resolve errors related to file I/O.

## Evaluation Criteria & Functional Requirements

Your code will be evaluated based on the following criteria:

* The project must not have any build errors.
* The expected results are output to the files.


### FizzWriter

Create a program to write out the result of FizzBuzz (1 to 300) to a file called `FizzBuzz.txt`. The file should be written out to the same directory as this README file.

* If the number is divisible by 3 or contains a 3, print “Fizz.”
* If the number is divisible by 5 or contains a 5, print “Buzz.”
* If the number is divisible by 3 and 5, print “FizzBuzz.”
* Otherwise, print the number.


```

Expected Output:
```
FizzBuzz.txt has been created.
```

Things to keep in mind:

* Use the `less` command or your favorite text editor to verify the contents of the file are what you expect them to be. **The contents of the file _will_ be evaluated based on the requirements specified above**.
* A new file should be created each time the application runs.
* There is no user interaction in this application. The application should run and terminate. You should not need to press a key to stop the application.

### File Splitter (Challenge)

Develop an application that takes a significantly large input file and splits it into smaller file chunks. These types of files were common back when floppy disks were smaller and couldn't hold a larger program on their own.

To determine how many files need to be produced, ask the user for the maximum amount of lines that should appear in each output file.


Sample Input/Output:
```
Where is the input file (please include the path to the file)? [path-to-file]/input.txt
How many lines of text (max) should there be in the split files? 3
The input file has 50 lines of text.

Each file that is created should have a sequential number assigned to it.

For a 50 line input file "input.txt", this produces 17 output files.

**GENERATING OUTPUT**

Generating input-1.txt
Generating input-2.txt
Generating input-3.txt
Generating input-4.txt
Generating input-5.txt
Generating input-6.txt
Generating input-7.txt
Generating input-8.txt
Generating input-9.txt
Generating input-10.txt
Generating input-11.txt
Generating input-12.txt
Generating input-13.txt
Generating input-14.txt
Generating input-15.txt
Generating input-16.txt
Generating input-17.txt

```

Things to keep in mind:


* Use the `less` command or your favorite text editor to verify the contents of the file are what you expect them to be.
* The input file name should be the prefix (the first part of the file name) followed by a dash (`-`), then the number of the current file, and finally ending with the file extension of the input file. For instance, if the name of the file was `big-old-file.md`, the file names should be `big-old-file-1.md`, `big-old-file-2.md`, etc.
* Output files are written to the directory the input file is in.
* The application should run and terminate. You should not need to press a key to stop the application.

## Getting Started

* Import the file-io-part2-exercises project into Eclipse.
* Open the java file for the application you are working on. The files are located in the src/main/java/com/techelevator directory.
* Provide enough code to get the program started.
* Repeat until the features have been implemented as outlined in the functional requirements.


---

[file-api-docs]: https://docs.oracle.com/javase/8/docs/api/java/io/File.html
