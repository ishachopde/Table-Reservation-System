

    <head>
<meta charset="utf-8">  
                          
<title>JavaScript Form Validation using a sample registration form</title>  
<meta name="keywords" content="example, JavaScript Form Validation, Sample registration form" />  
<meta name="description" content="This document is an example of JavaScript Form Validation using a sample registration form. " />  
<link rel='stylesheet' href='Images/css.css' type='text/css' />  
<script src="sample-registration-form-validation.js"></script>  
</head>  
    <body  onload="document.registration.userid.focus();" style="backgound: url('../Images/background2.jpg') fixed;background-position:centre;border:10;">
 
<form name='registration' onSubmit="return formValidation();">  
   
       <h1 style='color:white; font-style: bold'>Registration form</h1>
    <table cellspacing="0.2" cellpadding="0.2" border="0.5" bordercolor="brown">
       
        <p><font color="white" size="3" ><b><i>*we look towards serving our customers better and faster by<br> facilitating you to reserve a table and according to mood !!!</b></i></font></p>
      

<tr><td><li><label for="username"><font size="5" color="white">Guest Name:</font></label></li></td>  
        <td><li><input type="text" name="NAME" value="" required /></li></td>  </tr>

<tr><td><li><label for="address"><font size="5" color="white">Contact</font></label></li></td> 
        <td><li><input type="text" name="CONTACT" value="" required=""/></li></td>  </tr>
        

<tr><td><li><label for="address"><font size="5" color="white">Address:</font></label></li></td> 
<td><li><input type="text" name="ADDRESS" value="" required /></li></td></tr>
        

<tr><td><li><label for="address"><font size="5" color="white">City:</font></label></li></td> 
        <td><li><input type="text" name="ADDRESS" value="" required /></li></td></tr>

<tr><td><li><label for="address"><font size="5" color="white">Province:</font></label></li></td> 
        <td><li><input type="text" name="ADDRESS" value="" required /></li></td></tr>

<tr><td><li><label for="country"><font size="5" color="white">Country:</font></label></li></td>  
<td><li><select name="COUNTRY">  
<option selected="" value="Default"></option>  
<option value="AF">Australia</option>  
<option value="AL">Canada</option>  
<option value="DZ">India</option>  
<option value="AS">Russia</option>  
<option value="AD">USA</option>  
    </select></li></td></tr>

<tr><td><li><label for="zip"><font size="5" color="white">ZIP Code:</font></label></li></td>  
<td><li><input type="text" name="ZIP" value="" required/></li></td></tr>  

<tr><td><li><label for="email"><font size="5" color="white">Email:</font></label></li></td>  
<td><li><input type="text" name="EMAIL" value="" required /></li></td></tr>

        <tr><td><font size="5" color="white">Gender:</font> </td>  <td><select name="GENDER"> 
                                             <option value="">SELECT</option>
                                             <option value="m">MALE</option>
                                               <option value="f">FEMALE</option>
                                       </select></td></tr><br><br>
    </table>
 <tr colspan='3'> <td><li>
 <button onclick="location.href = 'Summary.html';" id="myButton" class="float-left submit-button" >Reserve Table</button>
 
 
  <script type="text/javascript">
  function formValidation()  
{  
var uid = document.registration.userid;  
var passid = document.registration.passid;  
var uname = document.registration.username;  
var uadd = document.registration.address;  
var ucountry = document.registration.country;  
var uzip = document.registration.zip;  
var uemail = document.registration.email;  
var umsex = document.registration.msex;  
var ufsex = document.registration.fsex; if(userid_validation(uid,5,12))  
{  
if(passid_validation(passid,7,12))  
{  
if(allLetter(uname))  
{  
if(alphanumeric(uadd))  
{   
if(countryselect(ucountry))  
{  
if(allnumeric(uzip))  
{  
if(ValidateEmail(uemail))  
{  
if(validsex(umsex,ufsex))  
{  
}  
}   
}  
}   
}  
}  
}  
}  
return false;  
}  
function userid_validation(uid,mx,my)  
{  
var uid_len = uid.value.length;  
if (uid_len == 0 || uid_len >= my || uid_len < mx)  
{  
alert("User Id should not be empty / length be between "+mx+" to "+my);  
uid.focus();  
return false;  
}  
return true;  
}  

function passid_validation(passid,mx,my)  
{  
var passid_len = passid.value.length;  
if (passid_len == 0 ||passid_len >= my || passid_len < mx)  
{  
alert("Password should not be empty / length be between "+mx+" to "+my);  
passid.focus();  
return false;  
}  
return true;  
}  

function allLetter(uname)  
{   
var letters = /^[A-Za-z]+$/;  
if(uname.value.match(letters))  
{  
return true;  
}  
else  
{  
alert('Username must have alphabet characters only');  
uname.focus();  
return false;  
}  
}  
function alphanumeric(uadd)  
{   
var letters = /^[0-9a-zA-Z]+$/;  
if(uadd.value.match(letters))  
{  
return true;  
}  
else  
{  
alert('User address must have alphanumeric characters only');  
uadd.focus();  
return false;  
}  
}  

function countryselect(ucountry)  
{  
if(ucountry.value == "Default")  
{  
alert('Select your country from the list');  
ucountry.focus();  
return false;  
}  
else  
{  
return true;  
}  
}  

function allnumeric(uzip)  
{   
var numbers = /^[0-9]+$/;  
if(uzip.value.match(numbers))  
{  
return true;  
}  
else  
{  
alert('ZIP code must have numeric characters only');  
uzip.focus();  
return false;  
}  
}  

function ValidateEmail(uemail)  
{  
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
if(uemail.value.match(mailformat))  
{  
return true;  
}  
else  
{  
alert("You have entered an invalid email address!");  
uemail.focus();  
return false;  
}  
}  

function validsex(umsex,ufsex)  
{  
x=0;  
  
if(umsex.checked)   
{  
x++;  
} if(ufsex.checked)  
{  
x++;   
}  
if(x==0)  
{  
alert('Select Male/Female');  
umsex.focus();  
return false;  
}  
else  
{  
alert('Form Successfully Submitted');  
window.location.reload()  
return true;}  
} 


</script>
</form>  

</body>  
 