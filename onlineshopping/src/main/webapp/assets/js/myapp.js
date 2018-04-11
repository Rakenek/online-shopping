$(function(){
	
	switch(menu)
	{
		case'O nas':
			$('#about').addClass('nav-item active');
			break;
		case'All Products':
			$('#listProducts').addClass('nav-item active');
			break;
		case'Skontaktuj':
			$('#contact').addClass('nav-item active');
			break;
		default:
			$('#listProducts').addClass('nav-item active');
			$('#a_'+menu).addClass('active');
			break;
			
	}
	
});