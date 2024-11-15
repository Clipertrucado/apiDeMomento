package JSIA.apiMoteros.daos;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "usuarios") // Asegúrate de que el esquema es correcto
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nombre_usuario", length = 255, nullable = false, columnDefinition = "varchar(255) default 'aaaaa'")
    private String nombreUsuario = "aaaaa";

    @Column(name = "apellidos_usuarios", length = 255, nullable = false, columnDefinition = "varchar(255) default 'aaaaa'")
    private String apellidosUsuario = "aaaaa";

    @Column(name = "mail_usuario", length = 255, nullable = false, columnDefinition = "varchar(255) default 'aaaaa'")
    private String mailUsuario = "aaaaa";

    @Column(name = "fecha_nacimiento_usuario")
    private Date fechaNacimientoUsuario;

    @Column(name = "nickname_usuario", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String nicknameUsuario = "aaaaa";

    @Column(name = "contrasenya_usuario", length = 255, nullable = false, columnDefinition = "varchar(255) default 'aaaaa'")
    private String contrasenyaUsuario = "aaaaa";

    @Column(name = "fecha_alta_usuario")
    private Date fechaAltaUsuario;

    @Column(name = "descripcion_usuario", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String descripcionUsuario = "aaaaa";

    @Column(name = "dni_usuario", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String dniUsuario = "aaaaa";

    @Column(name = "telefono_usuario", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String telefonoUsuario = "aaaaa";

    @Lob
    @Column(name = "img_usuario")
    private byte[] imgUsuario;

    @Column(name = "rol_usuario", length = 255, columnDefinition = "varchar(255) default 'aaaaa'")
    private String rolUsuario = "aaaaa";

    // Constructor vacío requerido por JPA
    public Usuarios() {
    }

    // Constructor con parámetros
    public Usuarios(String nombreUsuario, String apellidosUsuario, String mailUsuario, Date fechaNacimientoUsuario,
                   String nicknameUsuario, String contrasenyaUsuario, Date fechaAltaUsuario, String descripcionUsuario,
                   String dniUsuario, String telefonoUsuario, byte[] imgUsuario, String rolUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.mailUsuario = mailUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.nicknameUsuario = nicknameUsuario;
        this.contrasenyaUsuario = contrasenyaUsuario;
        this.fechaAltaUsuario = fechaAltaUsuario;
        this.descripcionUsuario = descripcionUsuario;
        this.dniUsuario = dniUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.imgUsuario = imgUsuario;
        this.rolUsuario = rolUsuario;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public String getMailUsuario() {
        return mailUsuario;
    }

    public void setMailUsuario(String mailUsuario) {
        this.mailUsuario = mailUsuario;
    }

    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public String getNicknameUsuario() {
        return nicknameUsuario;
    }

    public void setNicknameUsuario(String nicknameUsuario) {
        this.nicknameUsuario = nicknameUsuario;
    }

    public String getContrasenyaUsuario() {
        return contrasenyaUsuario;
    }

    public void setContrasenyaUsuario(String contrasenyaUsuario) {
        this.contrasenyaUsuario = contrasenyaUsuario;
    }

    public Date getFechaAltaUsuario() {
        return fechaAltaUsuario;
    }

    public void setFechaAltaUsuario(Date fechaAltaUsuario) {
        this.fechaAltaUsuario = fechaAltaUsuario;
    }

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public byte[] getImgUsuario() {
        return imgUsuario;
    }

    public void setImgUsuario(byte[] imgUsuario) {
        this.imgUsuario = imgUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", apellidosUsuario='" + apellidosUsuario + '\'' +
                ", mailUsuario='" + mailUsuario + '\'' +
                ", fechaNacimientoUsuario=" + fechaNacimientoUsuario +
                ", nicknameUsuario='" + nicknameUsuario + '\'' +
                ", contrasenyaUsuario='" + contrasenyaUsuario + '\'' +
                ", fechaAltaUsuario=" + fechaAltaUsuario +
                ", descripcionUsuario='" + descripcionUsuario + '\'' +
                ", dniUsuario='" + dniUsuario + '\'' +
                ", telefonoUsuario='" + telefonoUsuario + '\'' +
                ", rolUsuario='" + rolUsuario + '\'' +
                '}';
    }
}
