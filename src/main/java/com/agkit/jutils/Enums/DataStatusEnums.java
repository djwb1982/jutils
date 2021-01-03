package com.agkit.jutils.Enums;

/**公共状态--数据状态
 * @program: com.agcloud.common.DataStatus
 * @description:
 * @author: king djwb1982@163.com
 * @create: 2018-12-01 10:45
 **/
public enum DataStatusEnums {
	USING(0,"启用"),
	NO_USING(-1,"不启用"),
	DELETE(-2,"删除");

    private DataStatusEnums(int value,String name){
		this.value = value;
		this.name = name;
	}
    private int value;
	private String name;

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}
