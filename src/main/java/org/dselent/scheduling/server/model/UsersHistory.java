package org.dselent.scheduling.server.model;

import java.sql.JDBCType;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersHistory extends Model
{
	// table name
	public static final String TABLE_NAME = "users_history";
		
	// column names
	public static enum Columns
	{
		ID,
		USER_ID,
		USER_NAME,
		FIRST_NAME,
		LAST_NAME,
		EMAIL,
		ENCRYPTED_PASSWORD,
		SALT,
		USER_STATE_ID,
		CREATED_AT,
	}

	// enum list
	private static final List<Columns> COLUMN_LIST = new ArrayList<>();
	
	// type mapping
	private static final Map<Columns, JDBCType> COLUMN_TYPE_MAP = new HashMap<>();
	
	static
	{
		for(Columns key : Columns.values())
		{
			COLUMN_LIST.add(key);
		}
		
		COLUMN_TYPE_MAP.put(Columns.ID, JDBCType.INTEGER);
		COLUMN_TYPE_MAP.put(Columns.USER_ID, JDBCType.INTEGER);
		COLUMN_TYPE_MAP.put(Columns.USER_NAME, JDBCType.VARCHAR);
		COLUMN_TYPE_MAP.put(Columns.FIRST_NAME, JDBCType.VARCHAR);
		COLUMN_TYPE_MAP.put(Columns.LAST_NAME, JDBCType.VARCHAR);
		COLUMN_TYPE_MAP.put(Columns.ENCRYPTED_PASSWORD, JDBCType.VARCHAR);
		COLUMN_TYPE_MAP.put(Columns.SALT, JDBCType.VARCHAR);
		COLUMN_TYPE_MAP.put(Columns.USER_STATE_ID, JDBCType.INTEGER);
		COLUMN_TYPE_MAP.put(Columns.CREATED_AT, JDBCType.TIMESTAMP_WITH_TIMEZONE);
	};
	
	// attributes
	
	private Integer id;
	private Integer userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String encryptedPassword;
	private String salt;
	private Integer userStateId;
	private Instant createdAt;

	// methods
	
	public static JDBCType getColumnType(Columns column)
	{
		return COLUMN_TYPE_MAP.get(column);
	}
	
	public static String getColumnName(Columns column)
	{
		return column.toString().toLowerCase();
	}
	
	public static List<String> getColumnNameList()
	{
		List<String> columnNameList = new ArrayList<>();
		
		for(Columns column : COLUMN_LIST)
		{
			columnNameList.add(getColumnName(column));
		}
		
		return columnNameList;
	}
	
	//
	
	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}
	
	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}


	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEncryptedPassword()
	{
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword)
	{
		this.encryptedPassword = encryptedPassword;
	}

	public String getSalt()
	{
		return salt;
	}

	public void setSalt(String salt)
	{
		this.salt = salt;
	}

	public Integer getUserStateId()
	{
		return userStateId;
	}

	public void setUserStateId(Integer userStateId)
	{
		this.userStateId = userStateId;
	}

	public Instant getCreatedAt()
	{
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt)
	{
		this.createdAt = createdAt;
	}
	
	public void setCreatedAt(Timestamp createdAt)
	{
		if(createdAt != null)
		{
			this.createdAt = createdAt.toInstant();
		}
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((encryptedPassword == null) ? 0 : encryptedPassword.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((salt == null) ? 0 : salt.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userStateId == null) ? 0 : userStateId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (!(obj instanceof UsersHistory))
		{
			return false;
		}
		UsersHistory other = (UsersHistory) obj;
		if (createdAt == null)
		{
			if (other.createdAt != null)
			{
				return false;
			}
		}
		else if (!createdAt.equals(other.createdAt))
		{
			return false;
		}
		if (email == null)
		{
			if (other.email != null)
			{
				return false;
			}
		}
		else if (!email.equals(other.email))
		{
			return false;
		}
		if (encryptedPassword == null)
		{
			if (other.encryptedPassword != null)
			{
				return false;
			}
		}
		else if (!encryptedPassword.equals(other.encryptedPassword))
		{
			return false;
		}
		if (firstName == null)
		{
			if (other.firstName != null)
			{
				return false;
			}
		}
		else if (!firstName.equals(other.firstName))
		{
			return false;
		}
		if (id == null)
		{
			if (other.id != null)
			{
				return false;
			}
		}
		else if (!id.equals(other.id))
		{
			return false;
		}
		if (lastName == null)
		{
			if (other.lastName != null)
			{
				return false;
			}
		}
		else if (!lastName.equals(other.lastName))
		{
			return false;
		}
		if (salt == null)
		{
			if (other.salt != null)
			{
				return false;
			}
		}
		else if (!salt.equals(other.salt))
		{
			return false;
		}
		if (userName == null)
		{
			if (other.userName != null)
			{
				return false;
			}
		}
		else if (!userName.equals(other.userName))
		{
			return false;
		}
		if (userStateId == null)
		{
			if (other.userStateId != null)
			{
				return false;
			}
		}
		else if (!userStateId.equals(other.userStateId))
		{
			return false;
		}
		if (userId == null)
		{
			if (other.userId != null)
			{
				return false;
			}
		}
		else if (!userId.equals(other.userId))
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("UsersHistory [id=");
		builder.append(id);
		builder.append(", user_id=");
		builder.append(userId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", encryptedPassword=");
		builder.append(encryptedPassword);
		builder.append(", salt=");
		builder.append(salt);
		builder.append(", userStateId=");
		builder.append(userStateId);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append("]");
		return builder.toString();
	}
}
