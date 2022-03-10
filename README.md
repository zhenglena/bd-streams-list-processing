### List Processing

Expected time required: 25 min

Expanding on our last coding activity, we are now working on a class that has a number of methods for different
processing and filtering of a `List<String>` of file names. Complete the following methods in the class
`FileProcessor` using `Stream` operations to complete this assignment:

* `filterDocs()` returns a `List<String>` that contains only the file names for .txt and .md files, all
     lowercase and sorted alphabetically.
* `filterJava()` returns a `Set<String>` that contains only the file names for .java files, with each file
     capitalized.
* `sortAndSubmitAll()` sorts all file names in the list, and submits them to the project server via the
     method `submitToProject()`.

Verify your work by running the tests in `FileProcessorTest`.

HINTS:
* [What does capitalized mean?](hints/hint-01.md)
* [I'm having trouble getting my tests for filterDocs to pass. The tests say the list I'm creating is empty.](hints/hint-02.md)
