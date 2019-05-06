package nc.itf.pqm.pipelinepointdatas.mob;

import java.util.List;
import java.util.Map;

/**
 * ���ߵ������ƶ�Ӧ�÷���
 * 
 * @author  wugy
 * @time 2019-4-25 
 */
public interface IPipelinepointDatasMobService {
	
	/**
	 * �������ߵ�����
	 * 
	 * @author wugy
	 * @date 2019-4-25
	 * @param group
	 * @param param  ������
	 * @return
	 */
	public Map<String, Object> insertPipelinepointDatas (String creator,String pk_group, List<Map> plpList);

	/**
	 * ���ݵ�ǰ��Ŀ��ѯ���ߵ������б�
	 * 
	 * @author wugy
	 * @date 2019-4-25
	 * @param pk_project
	 * @return 
	 */
	public Map<String, Object> queryPipelinepointDatasByProject (Map<String, Object> param);

	/**
	 * ���ݹ��ߵ�����pk��ѯ���ߵ�������ϸ��Ϣ
	 * 
	 * @author wugy
	 * @date 2019-4-25
	 * @param pk_pipelinepointdatas
	 * @return 
	 */
	public Map<String, Object> queryPipelinepointDatasByPK (Map<String, Object> param);

	
}
