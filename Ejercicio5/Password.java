import java.util.Random;

public class Password {
	
	protected int longitud;
	protected String password;
	
	private final int longitud_default = 8;
	
	public Password () {
		this.longitud = longitud_default;
		this.password = crearPassword(longitud_default);
	}
	
	public Password (int longitud) {
		this.longitud = longitud;
		this.password = crearPassword(longitud);
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Password [password=" + password + "]";
	}

	public static String crearPassword (int longitud) {
		String password = "";
		
		Random rand = new Random();
		
		char[] caracteres ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X', 'Y','Z','a','b','c','d','e','f','g','e','h','i','j','l','k','m','n','o','p','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
		
		
		for(int i=0;i<longitud;i++) {
			
			password += caracteres[rand.nextInt(caracteres.length)]; 
		
		}
		
		return password;
	}
	
	public boolean esFuerte () {
		boolean es_fuerte = false;
		
		int mayus = 0;
		int minus = 0;
		int num = 0;
		char caracter;
		
		for(int i = 0;i<this.password.length();i++) {
			caracter = this.password.charAt(i);
			if(Character.isUpperCase(caracter)) {
				mayus++;
			}else if(Character.isLowerCase(caracter)){
				minus++;
			}else{
				num++;
			}
		}
		
		if(mayus>2 && minus>1 && num>5) {
			es_fuerte = true;
		}
		
		return es_fuerte;
	}
	
	
	
	
}