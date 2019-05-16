/**
 * 2019年4月1日
 *IFactory
 *
 *
 */
package org.saveFile;

/**
 * @author mac
 *
 */
public class IFactory {
	private IFactory() {};
	public static IFileService getInstance() {
		return new FileServiceImpl();
	}
}
