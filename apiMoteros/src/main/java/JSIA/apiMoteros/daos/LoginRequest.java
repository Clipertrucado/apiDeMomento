package JSIA.apiMoteros.daos;

public class LoginRequest {
    private String mailClub;
    private String contrasenyaClub;

    // Getters y Setters
    public String getMail() {
        return mailClub;
    }

    public void setMail(String mailClub) {
        this.mailClub = mailClub;
    }

    public String getContrasenya() {
        return contrasenyaClub;
    }

    public void setContrasenya(String contrasenyaClub) {
        this.contrasenyaClub = contrasenyaClub;
    }

	public LoginRequest(String mailClub, String contrasenyaClub) {
		super();
		this.mailClub = mailClub;
		this.contrasenyaClub = contrasenyaClub;
	}

	public LoginRequest() {
		super();
	}

	@Override
	public String toString() {
		return "LoginRequest [mailClub=" + mailClub + ", contrasenyaClub=" + contrasenyaClub + "]";
	}
    
	
}
