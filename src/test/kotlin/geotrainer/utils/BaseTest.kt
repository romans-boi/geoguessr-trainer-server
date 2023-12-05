package geotrainer.utils

import io.mockk.MockKAnnotations
import org.junit.Before

open class AsyncTest {

    @Before
    open fun setup() {
        MockKAnnotations.init(this)
    }
}