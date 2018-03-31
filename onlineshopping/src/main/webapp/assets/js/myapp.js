$(function(){
	
	switch(menu)
	{
		case'O nas':
			$('#about').addClass('nav-item active');
			break;
		case'ListaProduktow':
			$('#listProducts').addClass('nav-item active');
			break;
		case'Skontaktuj':
			$('#contact').addClass('nav-item active');
			break;
		default:
			$('#home').addClass('nav-item active');
			break;
			
	}
	
});