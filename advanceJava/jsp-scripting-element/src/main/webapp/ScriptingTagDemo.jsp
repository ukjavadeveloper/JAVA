


<!-- Declaration tag -->
<%!
int b=20;//instance variable
static int c =40;// static variable
 public void display(){
		 System.out.println("mehtod in jsp page....");
 }

%><!-- Scriplet tag -->
<% 
	display();
	int a=30;//local veriable
	if(a<=0){
		System.out.println("a=0");	
	}else{
		System.out.println("a!=o");
	}

%>
<br>
<!-- Expression tag -->
<%= a*a  %>

