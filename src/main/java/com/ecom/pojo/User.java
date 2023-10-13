package com.ecom.pojo;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_info")
public class User {
	@Id
	private String User_Id;
	
	@Column(name="userName",length=20)
	private String name;
	
	@Column(name="userEmail",length=20)
	private String email;
	
	@Column(name="password",length=20)
	private String password;
	
	@Column(name="mobile",length=20)
	private long mobile;
	
	@Column(name="usercode",length=5)
	private String usercode;
}
