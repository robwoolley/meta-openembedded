SUMMARY = "A faster version of dbus-next originally from the great DBus next library."
HOMEPAGE = "https://github.com/bluetooth-devices/dbus-fast"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=729e372b5ea0168438e4fd4a00a04947"

SRC_URI[sha256sum] = "8d0f0f61d007c1316ce79cde35ed52c0ce8ce229fd0f0bf8c9af2013ab4516a7"

PYPI_PACKAGE = "dbus_fast"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-core (>=3.7) \
    python3-async-timeout \
"
