Create or Replace Function hotelinformation(guestname In varchar2,
					    contact In number,
                                            address In varchar2,
                                            city In varchar2,
                                            province In varchar2,
					    country In varchar2,
                                            zipcode In number,
                                            email In varchar2,
                                           gender In varchar2)

   Return number
Is 
   nid number(2);
Begin 
	Select Nvl(Max(apptid),0)+1 into nid
	From hotelinfo;
	Insert into hotelinfo values(nid,guestname,contact,address,city,province,country,zipcode,email,gender);
   	If(Sql%Found) then
     		return nid;
   	End If;
      
            
Exception
   when others then
    return 0;
End;