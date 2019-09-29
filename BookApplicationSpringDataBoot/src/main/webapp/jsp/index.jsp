<html>
<script type="text/javascript">
function onSearchBook()
{
   var bookId = document.getElementById("bookId").value;
   document.searchbookform.action="searchbook/" + bookId;
   return true;
}
function onSearchSubject()
{
   var subjectId = document.getElementById("subjectId").value;
   document.searchsubjectform.action="searchsubject/" + subjectId;
   return true;
}
function onDeleteBook()
{
   var bookId = document.getElementById("deleteBookId").value;
   document.deletebookform.action="deletebook/" + bookId;
   return true;
}
function onDeleteSubject()
{
   var subjectId = document.getElementById("deleteSubjectId").value;
   document.deletesubjectform.action="deletesubject/" + subjectId;
   return true;
}
</script>
<body>
	<table border="1">
		<thead>Menu:</thead>
        <tr>
            <td>a.Add a Book</td>
            <td><a href="addbooklink" >Add</a></td>
        </tr>
        <tr>
            <td>b.Delete a Subject</td>
            <td>
            <form name="deletesubjectform" method="post" onsubmit="return onDeleteSubject();">         
		          Subject ID: <input type="text" id="deleteSubjectId" name="deleteSubjectId">                        
		         <input type="submit" value="Delete">
		    </form>
		    </td>
        </tr>
        <tr>
            <td>c.Delete a book</td>
            <td>
            <form name="deletebookform" method="post" onsubmit="return onDeleteBook();">         
		          Book ID: <input type="text" id="deleteBookId" name="deleteBookId">                        
		         <input type="submit" value="Delete">
		    </form>
		    </td>
        </tr>
        <tr>
            <td>d.Search for a book</td>
            <td>
            <form name="searchbookform" method="post" onsubmit="return onSearchBook();">         
		          Book ID: <input type="text" id="bookId" name="bookId">                        
		         <input type="submit" value="Search">
		    </form>
		    </td>
        </tr>
        <tr>
            <td>e.Search for a subject</td>
            <td>
            <form name="searchsubjectform" method="post" onsubmit="return onSearchSubject();">         
		          Subject ID: <input type="text" id="subjectId" name="subjectId">                        
		         <input type="submit" value="Search">
		    </form>
		    </td>
        </tr>
        <tr>
        	<td>f.Exit</td>
        	<td><button type="button" onclick="window.open('', '_self', ''); window.close();">Exit</button></td>        	
        </tr>
    </table>
</body>
</html>
