public class Array02Test{
	public static void main(String[] args){
		
	if(args.length!=2){
	return;
	}
	String username=args[0];
	String password=args[1];
		
	/*if(username.equals("zhangsan")&&password.equals("123")){
	System.out.println("��½�ɹ�");
	}else{System.out.println("�������");}*/

	
	if("zhangsan".equals(username)&&"123".equals(password)){
	System.out.println("��½�ɹ�");
	}else{System.out.println("�������");}
	
	}
}


/*public class Array02Test {
    // �û������������뵽String[] args���鵱�С�
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("ʹ�ø�ϵͳʱ�������������������а����û�����������Ϣ�����磺zhangsan 123");
            return;
        }

        // ����ִ�е��˴�˵���û�ȷʵ�ṩ���û��������롣
        // ��������Ӧ���ж��û����������Ƿ���ȷ��
        // ȡ���û���
        String username = args[0];
        // ȡ������
        String password = args[1];

        // �����û�����admin��������123��ʱ���ʾ��¼�ɹ�������һ��ʧ�ܡ�
        // �ж������ַ����Ƿ���ȣ���Ҫʹ��equals������
        //if(username.equals("admin") && password.equals("123")){
        // ������д�ǲ��ǿ��Ա����ָ���쳣��
        // �������±����񣬼�ʱusername��password����null��Ҳ������ֿ�ָ���쳣���������ϳ���Ա����һ����̾��顣��
        if("admin".equals(username) && "123".equals(password)){
            System.out.println("��¼�ɹ�����ӭ[" + username + "]����");
            System.out.println("�����Լ���ʹ�ø�ϵͳ....");
        }else{
            System.out.println("��֤ʧ�ܣ��û��������ڻ����������");
        }
    }
}
*/