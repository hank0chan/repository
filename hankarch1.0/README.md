# Hank Architecture Explore (hankarch-1.0)
#### ��Ҳ��֮ǰ�����architecture-of-web-chatsͨ�ÿ���������һ���ܽᣩ
## ����Maven�����ߺ�Spring��SpringMVC��Mybatis��ܵ�webӦ�ÿ����ܹ�����

### Spring����������Ŀ�������ݿ���dataSource��ͨ�����÷�ʽ����Beans����ҵ���ͨ��XML���÷�ʽ����Beans��
### SpringMVC��Controller��ͨ��ע�ⷽʽ����
### Mybatis����ԭ��������ʽ��ͨ������һ��MybatisRepository�������Mybatis���з�װ�������ṩ���͵�CRUD��������������DataRepository�̳У�����ͬʱʵ�ֳ������һ�������޲η���init(),�ڸ÷����е��ø����init()�вη�������init()�вη������βξ�����Ҫʹ�õ���ʵ�������
### ͨ��JSON֧�֣�����ֻ�ṩAPI�ӿڡ��ͻ��������ͨ��ajax���õȻ�ȡJSON����

## ������Ŀ��Ҫ�ɸ�pom��Ŀ��jar����Ŀ��war��web��Ŀ��ɡ�
### ���廮�������
#### hankarch-parent: ��pom.xml��Ŀ��ֻ�������jar��������ϵ��pom��
#### hankarch-web: webӦ����Ŀ�������ṩ�ӿڣ�war����Ŀ�� 
#### hankarch-portal: ǰ����Ŀ 
#### hankarch-util: �Զ��幤���ࣨjar����Ŀ�� 
#### hankarch-common: �Զ��幫���ࣨjar����Ŀ�� 
#### hankarch-data: ����ʵ���༰��Ӧ��Mapper�ӿں�Mapper�����ļ���jar����Ŀ�� 
#### hankarch-mybatis: Mybatis��װ�࣬����ԭʼ������ʽ��jar����Ŀ�� 
#### hankarch-service: ҵ���ӿ��ࣨjar����Ŀ�� 
#### hankarch-module-1���磺hankarch-user��: ҵ���ӿ�ʵ���࣬��Ϊһ����ģ��-1��Ŀ��jar����Ŀ�� 
#### hankarch-module-2���磺hankarch-article��: ҵ���ӿ�ʵ���࣬��Ϊһ����ģ��-2��Ŀ��jar����Ŀ�����Դ����ƣ�
