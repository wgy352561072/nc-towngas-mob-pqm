package nc.vo.pqm.pipelinepointdatas.mob;

import nc.vo.pm.mobile.base.MobileSuperVO;

/**
 * ���ߵ�����Listmobvo
 * @author wugy
 *
 */
public class PipelinepointdatasListMobVO extends MobileSuperVO {
	
	public static final String PK_PIPELINEPOINTDATAS = "pk_pipelinepointdatas";
	public static final String CODE = "code";

	
	
	public PipelinepointdatasListMobVO() {
		// ��ʼ��ʵ��洢���ݣ�����ѯʱ����
		setAttributeValue(PipelinepointdatasListMobVO.PK_PIPELINEPOINTDATAS, null);
		setAttributeValue(PipelinepointdatasListMobVO.CODE, null);
	}
	

	@Override
	public String getPKFieldName() {
		
		return PipelinepointdatasListMobVO.PK_PIPELINEPOINTDATAS;
	}


	@Override
	protected void constructMobRefRelationCardAggVO() {
		// TODO �Զ����ɵķ������

	}

	@Override
	protected void constructMobRefRelationListAggVO() {
		// TODO �Զ����ɵķ������

	}

}
