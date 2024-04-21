# Object Oriented Design
### Rob Veldman - 4977858
###### The code in it's current state does not show any presentations and I do not know why.

Changelog was added after making changes, which is why some changes might not be mentioned and some might be simplified because I don't remember exactly what I did.
## Changelog:

1. Removed unused variables from all classes
2. Removed unused methods from all classes
3. Reworked switch statement for controls because many switches could have been one switch
4. Refactored the accessor class to use a reader and writer.
5. Made adjustments to JabberPoint.java so it would use the new factory methods.
6. Made adjustments to MenuController so it would use the new factory methods

### V2 Changes:
1. Create the slide viewer frame before setting the slide number. (This was why it didn't work previously...)
2. Adjust MenuController to clear and append slides to the presentation instead of creating a new object to allow it to function properly.
3. Adjusted factory method string equality to use .equals.
