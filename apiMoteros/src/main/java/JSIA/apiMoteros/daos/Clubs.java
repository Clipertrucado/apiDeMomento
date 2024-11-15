package JSIA.apiMoteros.daos;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "clubs") // Asegúrate de que el esquema es correcto
public class Clubs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_club")
    private Long id;

    @Column(name = "nombre_club", length = 255, nullable = false, columnDefinition = "varchar(255) default 'aaaaa'")
    private String nombreClub = "aaaaa";

    @Column(name = "mail_club", length = 255, nullable = false, columnDefinition = "varchar(255) default 'aaaaa'")
    private String mailClub = "aaaaa";

    @Column(name = "contrasenya_club", length = 255, nullable = false, columnDefinition = "varchar(255) default 'aaaaa'")
    private String contrasenyaClub = "aaaaa";

    @Column(name = "colores_club", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String coloresClub = "aaaaa";

    @Column(name = "descripcion_club", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String descripcionClub = "aaaaa";

    @Column(name = "localizador_club", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String localizadorClub = "aaaaa";

    @Column(name = "fecha_alta_club")
    private Date fechaAltaClub;

    @Column(name = "nick_club", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String nickClub = "aaaaa";

    @Lob
    @Column(name = "img_club")
    private byte[] imgClub;

    @Column(name = "sede_club", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String sedeClub = "aaaaa";

    // Constructor vacío requerido por JPA
    public Clubs() {
    }

    // Constructor con parámetros
    public Clubs(String nombreClub, String mailClub, String contrasenyaClub, String coloresClub,
                String descripcionClub, String localizadorClub, Date fechaAltaClub, String nickClub,
                byte[] imgClub, String sedeClub) {
        this.nombreClub = nombreClub;
        this.mailClub = mailClub;
        this.contrasenyaClub = contrasenyaClub;
        this.coloresClub = coloresClub;
        this.descripcionClub = descripcionClub;
        this.localizadorClub = localizadorClub;
        this.fechaAltaClub = fechaAltaClub;
        this.nickClub = nickClub;
        this.imgClub = imgClub;
        this.sedeClub = sedeClub;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public String getMailClub() {
        return mailClub;
    }

    public void setMailClub(String mailClub) {
        this.mailClub = mailClub;
    }

    public String getContrasenyaClub() {
        return contrasenyaClub;
    }

    public void setContrasenyaClub(String contrasenyaClub) {
        this.contrasenyaClub = contrasenyaClub;
    }

    public String getColoresClub() {
        return coloresClub;
    }

    public void setColoresClub(String coloresClub) {
        this.coloresClub = coloresClub;
    }

    public String getDescripcionClub() {
        return descripcionClub;
    }

    public void setDescripcionClub(String descripcionClub) {
        this.descripcionClub = descripcionClub;
    }

    public String getLocalizadorClub() {
        return localizadorClub;
    }

    public void setLocalizadorClub(String localizadorClub) {
        this.localizadorClub = localizadorClub;
    }

    public Date getFechaAltaClub() {
        return fechaAltaClub;
    }

    public void setFechaAltaClub(Date fechaAltaClub) {
        this.fechaAltaClub = fechaAltaClub;
    }

    public String getNickClub() {
        return nickClub;
    }

    public void setNickClub(String nickClub) {
        this.nickClub = nickClub;
    }

    public byte[] getImgClub() {
        return imgClub;
    }

    public void setImgClub(byte[] imgClub) {
        this.imgClub = imgClub;
    }

    public String getSedeClub() {
        return sedeClub;
    }

    public void setSedeClub(String sedeClub) {
        this.sedeClub = sedeClub;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", nombreClub='" + nombreClub + '\'' +
                ", mailClub='" + mailClub + '\'' +
                ", contrasenyaClub='" + contrasenyaClub + '\'' +
                ", coloresClub='" + coloresClub + '\'' +
                ", descripcionClub='" + descripcionClub + '\'' +
                ", localizadorClub='" + localizadorClub + '\'' +
                ", fechaAltaClub=" + fechaAltaClub +
                ", nickClub='" + nickClub + '\'' +
                ", sedeClub='" + sedeClub + '\'' +
                '}';
    }
}
