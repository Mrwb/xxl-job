package com.xxl.job.core.util;

/**
 * sharding vo
 * @author xuxueli 2017-07-25 21:26:38
 */
public class ShardingUtil {

    private static InheritableThreadLocal<ShardingVO> contextHolder = new InheritableThreadLocal<ShardingVO>();

    public static class ShardingVO {

        private int index;  // sharding index
        private int total;  // sharding total
        private String relationship; // sharding group relationship


        public ShardingVO(int index, int total, String relationship) {
			this.index = index;
			this.total = total;
			this.relationship = relationship;
		}

		public String getRelationship() {
			return relationship;
		}

		public void setRelationship(String relationship) {
			this.relationship = relationship;
		}

		public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

    public static void setShardingVo(ShardingVO shardingVo){
        contextHolder.set(shardingVo);
    }

    public static ShardingVO getShardingVo(){
        return contextHolder.get();
    }

}
