�}z)  0�  |]����T�u
��n�� � DƄ�Xzժ��|�S�����|���5����+����S!�����A�ʕ��LNiu�Jte\�5��w��ͱУb	c"��D��e�by(�٪w�y�����@{��"5:��X����W���z��*J��bjt���Z^<����"*��9��YD��5�a�)h	9�R��5���ֳ�ô��K7�#W����ɧ#�>�@5�1^�g���Yna�C�T�r����.zB��v�
<`�q�M����%�{�S���駸�Շp8�+��N�|hj��X$���0���t��'0q�0�P�|���i#$5;�G�my�+Τ�A3Ƥ��2�x^�֓��Jմ�o��o�	�ln�=v�k}�K<o�*q���f��a]��+�T^�O����'g�;��B1S�߼e�8\K�p�XG�#)�֦��4J'|	lHJ���mV�<��,�mr|�>���{
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("newcrm.meetrend.com.myapplication", appContext.getPackageName());
    }
}
