package com.redshape.kindle.gcal.data.stores;

import com.redshape.kindle.gcal.core.data.store.ListStore;
import com.redshape.kindle.gcal.core.data.store.loaders.LoaderException;
import com.redshape.kindle.gcal.core.data.store.loaders.RefreshDataLoader;
import com.redshape.kindle.gcal.data.loaders.CalendarsLoader;

/**
 * @author Cyril A. Karpenko <self@nikelin.ru>
 * @package com.redshape.kindle.gcal.data.stores
 * @date 11/22/11 11:53 AM
 */
public class CalendarStore extends ListStore {

	public CalendarStore() throws LoaderException {
		super( new RefreshDataLoader( new CalendarsLoader(), 300000 ) );
	}

}
