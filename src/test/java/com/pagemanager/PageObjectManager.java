package com.pagemanager;

import com.pages.AmazonPage;

/**
 * 
 * @author SatheesKumar Murugan
 * @Date 22/12/2022
 * @Description To create the page object and also to make sure that the same
 *              object should not be created again and again for future
 *              references.
 *
 */
public class PageObjectManager {

	private AmazonPage amazonPage;

	public AmazonPage getAmazonPage() {
		return (amazonPage == null) ? amazonPage = new AmazonPage() : amazonPage;
	}


}
