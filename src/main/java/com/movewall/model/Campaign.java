package com.movewall.model;

import java.util.Date;

public class Campaign {
private String Name;
private  String Duration;
private String Status;
private Date Completeddate;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDuration() {
	return Duration;
}
public void setDuration(String duration) {
	Duration = duration;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Duration == null) ? 0 : Duration.hashCode());
	result = prime * result + ((Name == null) ? 0 : Name.hashCode());
	result = prime * result + ((Status == null) ? 0 : Status.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Campaign other = (Campaign) obj;
	if (Duration == null) {
		if (other.Duration != null)
			return false;
	} else if (!Duration.equals(other.Duration))
		return false;
	if (Name == null) {
		if (other.Name != null)
			return false;
	} else if (!Name.equals(other.Name))
		return false;
	if (Status == null) {
		if (other.Status != null)
			return false;
	} else if (!Status.equals(other.Status))
		return false;
	return true;
}
public Date getCompleteddate() {
	return Completeddate;
}
public void setCompleteddate(Date completeddate) {
	Completeddate = completeddate;
}

}
