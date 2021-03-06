package com.Dao;

import java.util.List;

 
import com.Entity.OtherToTag;
import com.Entity.Tag;


public interface OtherToTagDao {
	 
	//得到tag通过ID
	  Tag getTagById(Integer id);
	 //得DAO所有的tag
	  List<Tag> getTagAllDesc(); 
	//保存新tag
	  void saveTag (Tag tag);
	  //得到一个文章或者一个问题的所有的标签关系
	  List<OtherToTag> getOtherToTagByOtherAll(Integer otherId, String flag);
	  
	//关联文章or question 和tag
	  void saveOtherToTag(OtherToTag otherToTag);
 
	 //查找tag
	 List<Tag> getTagIdByName(String tagName);
	 
	 //删除一个关系(用户草稿的修改导致othertotag的revise)
	 void deleteOtherToTag(OtherToTag otherToTag);
	 //删除一个文章的时候删除关系
	 void delteArticleToTag(Integer otherId, String flag);
	 
	 //用于寻找用户的感兴趣的sport和article
	 List<OtherToTag> getOtherForRecommend(String flag, Integer tagId);
	 
	 //根据所有的tagid 得到所有的other（搜索）
	 List<OtherToTag> getOtherAllByTagId(Integer tag_id);
}
