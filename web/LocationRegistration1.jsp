
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <link rel='stylesheet'  href='Images/locationregistration.css' type='text/css'> 
    <p><font size="8" style="color: blanchedalmond"> Select your table right from your desk !!!<br><br></font>
           <font size="5" style="font-style: italic;"> We would be glad to reserve a table for you at our restaurant! </font>
           
    </head>

<body>



    <table width='600' border='2'>

        <tbody>
            <tr>
                <th scope='row'><font size='8' color='white'>Number of Guests</font></th>
                <td><input name='NUMBER' type='number' id='number' max='10' min='0'></td>
            </tr>

            <tr>
                <td><font size='8' color='white'>Special Requests</font></td>
                <td><input type='text' name='SPEREQ' id='specialrequests' ></td>
            </tr>


            <tr>
                <td><font size='8' color='white'>Select Date</font></td>


                <td>
                    <input type='date' name='date' id='date'></td>


            </tr>



            <tr>
                <td><font size='8' color='white'>Selected Time</td>
                <td><input type='time' name='time' id='time'>                </td>
            </tr>
            <tr>
                <th scope='row'><font size='8' color='white'>Table Location</font></th>
                <td>

                    <select 
                        onChange='if (this.selectedIndex != 0)
                                            self.location = this.options[this.selectedIndex].value'>
                        <option value='' selected>Select a Event Space
                        <option value='coffee.html'>Coffee Area
                        <option value='conf.html'>Conference Area
                    </select>
                </td>
            </tr>




        </tbody>
    </table>




</body>
</html>
