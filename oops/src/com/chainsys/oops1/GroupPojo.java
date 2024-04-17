package com.chainsys.oops1;

public class GroupPojo {
String schoolName;
String schoolId;
String groupType;
int noOfMajor;
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public String getSchoolID() {
	return schoolId;
}
public void setSchoolId(String schoolID) {
	this.schoolId = schoolID;
}
public String getGroupType() {
	return groupType;
}
public void setGroupType(String groupType) {
	this.groupType = groupType;
}
public int getNoOfMajor() {
	return noOfMajor;
}
public void setNoOfMajor(int noOfMajor) {
	this.noOfMajor = noOfMajor;
}
public GroupPojo(String schoolName, String schoolId, String groupType, int noOfMajor) {
	super();
	this.schoolName = schoolName;
	this.schoolId = schoolId;
	this.groupType = groupType;
	this.noOfMajor = noOfMajor;
}
public GroupPojo() {
	
}
@Override
public String toString() {
	return "GroupA [schoolName=" + schoolName + ", schoolID=" + schoolId + ", groupType=" + groupType + ", noOfMajor="
			+ noOfMajor + "]";
}

}
