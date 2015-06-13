::#!
@echo off
call scala %0 %*
goto :eof
::!#

// --- Place above code at the top of your script for Windows ---

// Although Scala is designed to help programmers build very large-scale systems, it also scales down nicely to scripting. 
// A script is just a sequence of statements in a file that will be executed sequentially.

// Say hello to the first argument
println("Hello, "+ args(0) +"!")

// ... more scala statements ...

// You can run the Scala script by executing batch file - helloarg.bat Tirthal