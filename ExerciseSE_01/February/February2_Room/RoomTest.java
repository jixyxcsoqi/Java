public class RoomTest{
	public static void main(String[] args){
	Room room=new Room("���巿��",101,true);
	System.out.println(room);

	 Room room1 = new Room("���巿��",101,true);
        System.out.println(room.equals(room1));
	}
}


class Room{
	private int no;
	private String type;
	private boolean status;
public Room(){};
public Room(String type,int no,boolean status){
this.type=type; this.no=no;   this.status=status;
}

	public void setNo(int no){
	this.no=no;}

	public int getNo(){
	return no;
	}

	public void setType(String type){
	this.type=type;}

	public String getType(){
	return type;
	}


	public void setStatus(boolean status){
	this.status=status;}

	public boolean getStatus(){
	return status;
	}

	public String toString(){
	return  "���������ǣ�"+type+"  "+"������ǣ�"+no+"   "+(status ?"����" : "ռ��");}
	
	
	  

	public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Room)) return false;
        if(this == obj) return true;
		//���ߵ�����Ϳ���ת����
        Room room = (Room)obj;
        // ��ǰ������ ���� �������ķ������ķ����š���Ϊ��ͬһ�����䡣
        return this.getNo() == room.getNo();
    }

		
	}



